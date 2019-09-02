<?php

namespace common;

/**
 * 测试类
 * Class Database
 * @package common
 */
class Database
{
    private $sql = '';

    public function __construct($table = 'user')
    {
        $this->sql = "select * from {$table}";
    }

    public function where($where)
    {
        $this->sql .= " where {$where} ";
        return $this;
    }

    public function limit($limit)
    {
        $this->sql .= " limit {$limit} ";
        return $this;
    }

    public function find()
    {
        return $this->sql;
    }

    public function setDatabase($falg)
    {
        if ($falg) {
            echo ' 连接 主 数据库 ';
        } else {
            echo ' 连接 从 数据库 ';
        }
        return $this;
    }

    public function query($sql)
    {
        echo $sql;
    }
}