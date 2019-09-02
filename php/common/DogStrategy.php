<?php

namespace common;


class DogStrategy implements Strategy
{
    public function eat()
    {
        echo 'eat shit';
    }

    public function shout()
    {
        echo 'wang wang wang';
    }

}