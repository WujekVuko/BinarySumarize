package sumarize.binary.Implementations;

import sumarize.binary.Classes.Binary;
import sumarize.binary.Classes.ResultZU2;
import sumarize.binary.interfaces.Sum;

public class SumZU2 implements Sum {
    public ResultZU2 result(Binary a, Binary b){
        return new ResultZU2(a,b);
    }
}
