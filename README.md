 private void btmCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCalculateActionPerformed
     try {
        double x = Double.parseDouble(txtNumber1.getText());
        double y = Double.parseDouble(txtNumber2.getText());
        double result = 0.0;

        String operator = txtOperator.getText();

        if (operator.equals("+")) {
            result = x + y;
        } else if (operator.equals("-")) {
            result = x - y;
        } else if (operator.equals("*")) {
            result = x * y;
        } else if (operator.equals("/")) {
            if (y != 0) {
                result = x / y;
            } else {
                txtOutput.setText("Error");
                return;
            }
        } else if (operator.equals("^")) {
            result = Math.pow(x, y);
        } else if (operator.equals("%")) {
            if (y != 0) {
                result = x % y;
            } else {
                txtOutput.setText("Error");
                return;
            }
        } else {
            txtOutput.setText("Error");
            return;
        }
        txtOutput.setText(" " + result);
    } catch (NumberFormatException ex) {
        txtOutput.setText("Error:Please Type Number");
    }
