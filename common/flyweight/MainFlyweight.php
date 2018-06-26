<?php

namespace common\flyweight;


class MainFlyweight
{
    /**
     * 享元池
     * @var array
     */
    protected static $flyweightPool = [];

    public function getFlyweight($str)
    {
        if(!isset(self::$flyweightPool[$str])){
            self::$flyweightPool[$str] = new MyFlyweight($str);
        }else{
            echo $str. '已经存在';
        }
        return self::$flyweightPool[$str];
    }
}