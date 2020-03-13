package seany;

import org.jbehave.core.annotations.*;
import org.jbehave.core.annotations.When;

public class Calculator {
    private char sign;
    private long a;
    private long b;
    private long result;


    @Given("a Calculator class with the operation sign as <sign>")
    public void givenACalculatorClassWithTheOperationSignAssign(@Named("sign") String sign) {
        this.sign = sign.charAt(0);
    }

    @When("I give the first number as <number1>")
    public void whenIGiveTheFirstNumberAsnumber1(@Named("number1") long a) {
        this.a = a;
    }

    @When("I give the second number as <number2>")
    public void whenIGiveTheSecondNumberAsnumber2(@Named("number2") long b) {
        this.b = b;
    }

    @Then("I should get the result as <result>")
    public void thenIShouldGetTheResultAsresult(@Named("result") long result) {


        Operation op = new Operation();
        if (sign == '+') {
            this.result = op.addition(this.a, this.b);
        }
        else {
            this.result = op.subtraction(this.a, this.b);

        }
    }




}
