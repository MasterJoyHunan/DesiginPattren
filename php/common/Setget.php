<?php

namespace common;

/**
 * PHP魔术方法
 * Class Setget
 * @package common
 */

class Setget
{
    private $arr = [];

    public function __set($name, $value)
    {
        $this->arr[$name] = $value;
    }

    public function __get($name)
    {
        return $this->arr[$name];
    }

    public function __call($name, $arguments)
    {
        var_dump($name);
        var_dump($arguments);
    }

    public static function __callStatic($name, $arguments)
    {
        var_dump($name);
        var_dump($arguments);
    }

    public function __toString()
    {
        return __CLASS__;
    }

    public function __invoke()
    {
        return __METHOD__;
    }

}