<?php
namespace common\adapter;

/**
 * 适配器模式
 * Interface Db
 * @package common\adapter
 */
interface Db
{
    public function connect();
    public function query($sql);
}