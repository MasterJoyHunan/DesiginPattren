<?php

namespace common;

/**
 * 迭代器模式
 * Class ObjIterator
 * @package common
 */

class ObjIterator implements \Iterator
{
    protected $object = [];
    protected $key = 0;

    public function __construct()
    {
        $this->object = [ 5, 6, 9, 8, 8, 2];
    }

    /**
     * 返回当前元素
     */
    public function current()
    {
        return $this->object[$this->key];
    }

    /**
     * 向前移动到下一个元素
     */
    public function next()
    {
        $this->key ++ ;
    }

    /**
     * 返回当前元素的键
     */
    public function key()
    {
        return $this->key;
    }

    /**
     * 检查当前位置是否有效
     */
    public function valid()
    {
        return isset($this->object[$this->key]);
    }

    /**
     * 返回到迭代器的第一个元素
     */
    public function rewind()
    {
        $this->key = 0;
    }

}