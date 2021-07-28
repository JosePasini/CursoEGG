package egg_poo_11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class ClaseDate {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar fechaUsuario = Calendar.getInstance();

        LocalDate ingresada = LocalDate.of(2000, 01, 01);
        LocalDate fechaHoy = LocalDate.now();

        Period periodoT = Period.between(ingresada, fechaHoy);

        System.out.println("\n Tiempo trasncurrido desde su fecha ingresada a HOY:" + ingresada.getYear()
                + "\n Años transcurridos(EDAD EJ:):" + periodoT.getYears());

        /*
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia."));

        while (dia < 1 || dia > 31) {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia correcto por favor."));
        }

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes."));
        while (mes < 1 || mes > 12) {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes correcto por favor."));
        }

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año."));

        while (anio > 2021 || anio < 1900) {
            anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año correcto por favor"));
        }

        fechaUsuario.set(Calendar.YEAR, anio);
        fechaUsuario.set(Calendar.MONTH, mes - 1);
        fechaUsuario.set(Calendar.DAY_OF_MONTH, dia);

        System.out.println("DIA: " + fechaUsuario.get(Calendar.DAY_OF_MONTH));
        System.out.println("MES: " + fechaUsuario.get(Calendar.MONTH));
        System.out.println("AÑO: " + fechaUsuario.get(Calendar.YEAR));

        System.out.println(calendar.getTime());

         */
    }

}
