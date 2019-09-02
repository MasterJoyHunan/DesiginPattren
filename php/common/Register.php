<?php

namespace common;

/**
 * 注册树模式,(依赖注入)
 * Class Register
 * @package common
 */
class Register
{
    protected static $obj = [];

    public static function set($key, $instance)
    {
        self::$obj[$key] = $instance;
    }

    public static function get($key)
    {
        return isset(self::$obj[$key]) ? self::$obj[$key] : '';
    }

    public function _unset($key)
    {
        unset(self::$obj[$key]);
    }
}