<?php

namespace common\observer;


class Observer1 implements Observer
{
    public function update()
    {
        echo __CLASS__ . ' update ()';
    }

}