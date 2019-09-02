<?php
namespace common\flyweight;


class MyFlyweight implements Flyweight
{
    protected $intrinsic;

    public function __construct($str)
    {
        $this->intrinsic = $str;
    }

    public function operation()
    {
        echo __CLASS__ . ' operation(' . $this->intrinsic . ')<br>';
    }

}