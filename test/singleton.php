<?php
namespace test;
use common\Singleton as SingletonPattren;

class singleton
{
    /**
     * 单例模式, 获取的对象都是同一个对象
     */
    public function index()
    {
        $res = new SingletonPattren();
        var_dump($res);
        SingletonPattren::getInstance()->doSomething();
        SingletonPattren::getInstance()->doSomething();
        SingletonPattren::getInstance()->doSomething();
        SingletonPattren::getInstance()->doSomething();
    }
}

