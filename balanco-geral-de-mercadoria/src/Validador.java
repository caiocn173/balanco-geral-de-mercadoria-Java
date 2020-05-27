
import java.util.InputMismatchException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Charles
 */
public class Validador {

    public static boolean cpf(String scpf) {

        int[] cpf = new int[11];
        String tcpf = "";
        int dv1 = 0;
        int dv2 = 0;
        int sm = 0;
        int r = 0;
        int i = 0;
        boolean verificador = true;
        try {

            for (int n = 0; n < scpf.length(); n++) {
                if ((scpf.charAt(n) - 48) == 1 || (scpf.charAt(n) - 48) == 2
                        || (scpf.charAt(n) - 48) == 3 || (scpf.charAt(n) - 48) == 4
                        || (scpf.charAt(n) - 48) == 5 || (scpf.charAt(n) - 48) == 6
                        || (scpf.charAt(n) - 48) == 7 || (scpf.charAt(n) - 48) == 8
                        || (scpf.charAt(n) - 48) == 9 || (scpf.charAt(n) - 48) == 0) {
                    cpf[i] = (int) (scpf.charAt(n) - 48);
                    i++;
                }
            }

            // Verificador 1
            for (int n = 0; n < 9; n++) {
                sm += (cpf[n] * (10 - n));
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dv1 = 0;
            } else {
                dv1 = r;
            }

            sm = 0;
            // Verificador 2
            for (int n = 0; n < 10; n++) {
                sm += (cpf[n] * (11 - n));
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dv2 = 0;
            } else {
                dv2 = r;
            }

            if (dv1 != cpf[9] || dv2 != cpf[10]) {
                verificador = false;
            }
            for (int n = 0; n < cpf.length; n++) {
                tcpf += cpf[n];
            }
            if (tcpf.equals("00000000000")
                    || tcpf.equals("11111111111")
                    || tcpf.equals("22222222222") || tcpf.equals("33333333333")
                    || tcpf.equals("44444444444") || tcpf.equals("55555555555")
                    || tcpf.equals("66666666666") || tcpf.equals("77777777777")
                    || tcpf.equals("88888888888") || tcpf.equals("99999999999")
                    || (tcpf.length() != 11)) {
                verificador = false;
            
            }

            return verificador;
        } catch (InputMismatchException erro) {
            
            return (false);
        }
    }
}
