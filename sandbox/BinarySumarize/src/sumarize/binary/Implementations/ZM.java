package sumarize.binary.Implementations;

import sumarize.binary.Classes.Binary;
import sumarize.binary.interfaces.Z;

public class ZM implements Z {
    public Binary changeToBinary(int decimal){
        return new Binary(decimal);
    }
}
