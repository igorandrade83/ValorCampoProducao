package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoWeb {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// BlocoWeb
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.grid1782")).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

