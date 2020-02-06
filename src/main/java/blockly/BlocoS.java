package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoS {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// BlocoS
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.cronlistClass1")).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

