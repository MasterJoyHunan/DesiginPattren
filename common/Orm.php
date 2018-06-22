<?php

namespace common;

/**
 * Object Relation Mapping
 * 数据对象映射, 将对对象的操作实际操作数据
 * Class Orm
 * @package common
 */
class Orm
{
    protected $filename;
    protected $data;
    protected $append = 0;

    public function __construct($fileName = 'test.txt')
    {
        $this->filename = $fileName;
    }

    public function setData($data)
    {
        $this->data = $data;
        return $this;
    }

    public function append($flag = false)
    {
        $this->append = $flag ? FILE_APPEND : 0;
    }

    public function delete()
    {
        return @unlink(__DIR__. '/../test/'.$this->filename);
    }

    public function save()
    {
//        echo __DIR__. $this->filename; exit;
        return file_put_contents(__DIR__. '/../test/'.$this->filename, $this->data, $this->append);
    }
}