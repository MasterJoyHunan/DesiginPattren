<?php

namespace common;

/**
 * 单例模式
 * Class Singleton
 * @package common
 */
class Singleton
{
    private static $instance;

    public static function getInstance()
    {
        if(empty(self::$instance)){
            self::$instance = new self();
        }
        return self::$instance;
    }


    public function doSomething()
    {
        var_dump(self::$instance);
    }
}