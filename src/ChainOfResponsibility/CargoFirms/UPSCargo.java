package ChainOfResponsibility.CargoFirms;

import ChainOfResponsibility.Base.*;
import ChainOfResponsibility.Cargo;

public class UPSCargo {
    public static Cargo getCargo(){
        IstanbulCargoBase istanbulCargoBase = new IstanbulCargoBase();
        AnkaraCargoBase ankaraCargoBase = new AnkaraCargoBase();
        GaziAntepCargoBase gaziAntepCargoBase = new GaziAntepCargoBase();
        IzmirCargoBase izmirCargoBase = new IzmirCargoBase();
        KusAdasiCargoBase kusAdasiCargoBase = new KusAdasiCargoBase();
        DatcaCargoBase datcaCargoBase= new DatcaCargoBase();

        Cargo cargo = istanbulCargoBase.setNextCargo(ankaraCargoBase
                .setNextCargo(izmirCargoBase
                        .setNextCargo(kusAdasiCargoBase
                                .setNextCargo(datcaCargoBase))));
                        return cargo;
    }

}
