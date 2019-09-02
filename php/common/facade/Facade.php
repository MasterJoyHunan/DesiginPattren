<?php
namespace common\facade;
/**
 * 门面模式 - 内聚操作, 对外一个公开的接口, 并不关注接口实现的细节
 * Class Facade
 * @package common\facade
 */
class Facade
{
    private $instance1;
    private $instance2;
    private $instance3;

    public function __construct()
    {
        $this->instance1 = new Operation1();
        $this->instance2 = new Operation2();
        $this->instance3 = new Operation3();
    }

    public function index()
    {
        $this->instance1->dosome();
        $this->instance2->dosome();
        $this->instance3->dosome();
    }
}