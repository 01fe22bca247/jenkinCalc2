class Calculator extends ExtendedCalc {
     
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
        float squ_result = calc.square(operand_1);
        System.out.println("square result: " + squ_result);
        float cube_result = calc.cube(operand_1); // corrected
        System.out.println("cube result: " + cube_result);
    }
}

