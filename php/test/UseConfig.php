<?php

namespace test;
use common\Config;
use common\observer\Event2;

class UseConfig extends Event2
{
    public function index()
    {
        $config = new Config();
        $controller = $config->get('Controller');
        $decorators = [];
        foreach ($controller as $class){
            $decorators[] = new $class;
        }
        foreach ($decorators as $decorator){
            $decorator->makeBefore();
        }
        echo '<hr>do some thing() <br> <hr>';
        $decorators = array_reverse($decorators);
        foreach ($decorators as $decorator){
            $decorator->makeAfter();
        }

        $this->notify();
    }
}