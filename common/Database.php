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

    public function where($where){
        $this->sql .= " where {$where} ";
        return $this;
    }

    public function limit($limit){
        $this->sql .= " limit {$limit} ";
        return $this;
    }

    public function find(){
        return $this->sql;
    }
}