package sumarize.binary.Implementations;

import sumarize.binary.Classes.Binary;
import sumarize.binary.Classes.Result;

import sumarize.binary.interfaces.Sum;

public class SumZM implements Sum {
    public Result result(Binary a, Binary b) {
       return new Result(a,b);
    }
}
