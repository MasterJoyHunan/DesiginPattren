<?php
namespace common;

/**
 * 工厂模式
 * Class Factory
 * @package common
 */
class Factory
{
    public static function createDatabase()
    {
        return new Database();
    }

    public static function getFileOrm()
    {
        if (empty(Register::get('fileOrm'))){
            Register::set('fileOrm', new Orm());
        }
        return Register::get('fileOrm');
    }
}