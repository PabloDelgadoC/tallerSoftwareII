import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class StepDefs {
private String cliente;
private String actualAnswer;

@Given("Un nuevo cliente que quiere un seguro")
public void un_nuevo_cliente_que_quiere_un_seguro() {
cliente = "cliente1";
}
@Given("Un nuevo {string} que quiere adquirir un seguro")
public void un_nuevo(String cliente) {
this.cliente = cliente;
}
@When("Se lo registre como nuevo cliente")
public void se_lo_registre_como_nuevo_cliente() {
actualAnswer = IsItCliente.isItCliente(cliente);
}
@Then("Mostrara el valor de su seguro {string}")
public void Mostrara_el_valor_de_su_seguro(String expectedAnswer) {
assertEquals(expectedAnswer, actualAnswer);
}