package sumarize.binary.Implementations;

import sumarize.binary.Classes.Binary;
import sumarize.binary.Classes.ResultZU1;
import sumarize.binary.interfaces.Sum;

public class SumZU1 implements Sum {
    public ResultZU1 result(Binary a, Binary b){
        return new ResultZU1(a, b);
    }
}
