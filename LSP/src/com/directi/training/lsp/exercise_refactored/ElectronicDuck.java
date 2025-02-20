package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements SwimQuack
{
    private boolean _on = false;

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck is off and cannot quack.");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swims...");
        } else {
            System.out.println("Electronic duck is off and cannot swim.");
        }
    }
}
