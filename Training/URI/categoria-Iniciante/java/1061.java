import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String diaInicial = scanner.nextLine();
		String[] splitDiaInicial = diaInicial.split("[ ]");
		String horaInicial = scanner.nextLine();
		String[] splitHoraInicial = horaInicial.split(" " + "[:]" + " ");

		String diaFinal = scanner.nextLine();
		String[] splitDiaFinal = diaFinal.split("[ ]");
		String horaFinal = scanner.nextLine();
		String[] splitHoraFinal = horaFinal.split(" " + "[:]" + " ");

		int di = Integer.parseInt(splitDiaInicial[1]);
		int hi = Integer.parseInt(splitHoraInicial[0]);
		int mi = Integer.parseInt(splitHoraInicial[1]);
		int si = Integer.parseInt(splitHoraInicial[2]);

		int df = Integer.parseInt(splitDiaFinal[1]);
		int hf = Integer.parseInt(splitHoraFinal[0]);
		int mf = Integer.parseInt(splitHoraFinal[1]);
		int sf = Integer.parseInt(splitHoraFinal[2]);



		int qtdDia = 0;
		int qtdHoras = 0;
		int qtdMinuto = 0;
		int qtdSegundo = 0;

		if(hi > hf) {
			qtdDia = df-di-1;
			qtdHoras = 24 - (hi - hf);
			if(mf >= mi) {
				qtdMinuto = mf - mi;
			} else {
				qtdHoras -= 1;
				qtdMinuto = 60 - (mi - mf);
			}

			if(sf >= si) {
				qtdSegundo = sf - si;
			} else {
				qtdMinuto--;
				qtdSegundo = 60 - (si - sf);
			}
		} else if (hf >= hi) {
			qtdDia = df - di;
			qtdHoras = hf - hi;
			if(mf >= mi) {
				qtdMinuto = mf - mi;
			} else {
				qtdHoras--;
				qtdMinuto = 60 - (mi - mf);
			}

			if(sf >= si) {
				qtdSegundo = sf - si;
			} else {
				qtdMinuto--;
				qtdSegundo = 60 - (si - sf);
			}
		}

		System.out.println(qtdDia + " dia(s)");
		System.out.println(qtdHoras + " hora(s)");
		System.out.println(qtdMinuto + " minuto(s)");
		System.out.println(qtdSegundo + " segundo(s)");

	}
}
