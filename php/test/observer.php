<?php

namespace test;
use common\observer\{Event, Observer1, Observer2, Observer3};

class observer extends Event
{
    public function index()
    {
        $this->addObserver(new Observer1());
        $this->addObserver(new Observer2());
        $this->addObserver(new Observer3());
        echo '产生事件';
        $this->notify();
    }
}