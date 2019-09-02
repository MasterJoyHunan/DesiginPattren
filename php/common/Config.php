<?php

namespace common;

/**
 * 定义配置文件
 * ArrayAccess 能让一个对象变成数组方式访问
 * Class Config
 * @package common
 */
class Config implements \ArrayAccess
{
    private $configs = [];

    public function __construct()
    {
        $dir = __DIR__ . DIRECTORY_SEPARATOR . 'config' . DIRECTORY_SEPARATOR;
        if (is_dir($dir)) {
            $dh = opendir($dir);
            while ($file = readdir($dh)) {
                if($file != '.' && $file != '..' && strpos($file, '.php')){
                    $file_name = trim($file, '.php');
                    $this->configs[$file_name] = require  __DIR__ . DIRECTORY_SEPARATOR . 'config' . DIRECTORY_SEPARATOR . $file;
                }
            }
        }
    }

    /**
     * 检查一个偏移位置是否存在
     * @param mixed $offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->configs[$offset]);
    }

    /**
     * 获取一个偏移位置的值
     * @param mixed $offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return $this->configs[$offset];
    }

    /**
     * 设置一个偏移位置的值
     * @param mixed $offset
     * @param mixed $value
     */
    public function offsetSet($offset, $value)
    {
        $this->configs[$offset] = $value;
    }

    /**
     * 复位一个偏移位置的值
     * @param mixed $offset
     */
    public function offsetUnset($offset)
    {
        $this->configs[$offset] = '';
    }

    public function get($offset)
    {
        return $this->offsetGet($offset);
    }

    public function pull()
    {
        return $this->configs;
    }

}