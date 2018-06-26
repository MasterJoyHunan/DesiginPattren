<?php

namespace test;
use common\flyweight\MainFlyweight;

class flyweight
{
    public function index()
    {
        $mf = new MainFlyweight();
        $a = $mf->getFlyweight('a');
        $a->operation();
        $b = $mf->getFlyweight('b');
        $b->operation();
        $c = $mf->getFlyweight('a');
        $c->operation();
    }
}