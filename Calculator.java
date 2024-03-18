class Calculator {
    float addition(float operand_1, float operand_2) {
        return (operand_1 + operand_2);
    }

    float subtraction(float operand_1, float operand_2) {
        return (operand_1 - operand_2);
    }



    public static void main(String[] args) {
        float operand_1 = 10;
        float operand_2 = 5;
        Calculator calc = new Calculator();
        float add_result = calc.addition(operand_1, operand_2);
        System.out.println("Addition result: " + add_result);
        float sub_result = calc.subtraction(operand_1, operand_2); // corrected
        System.out.println("Subtraction result: " + sub_result);
    }
}

