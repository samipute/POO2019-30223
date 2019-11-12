public class TestGhiozdan {
	public static void main(String argv[]) {
		Rechizita[] rechizite = new Rechizita[10];
		int nrRechizite = 5;
		rechizite[0] = new Manual("Geogra");
		rechizite[1] = new Manual("Muzica");
		rechizite[2] = new Manual("Civica");
		rechizite[3] = new Caiet("Istorie");
		rechizite[4] = new Caiet("Chimie ;)");

		Caiet caiet1 = new Caiet("Franceza");
		Caiet caiet2 = new Caiet("Engleza");
		Manual manual = new Manual("Rusa sau Cyka Blyat");

		Ghiozdan ghiozdanulMeu = new Ghiozdan(rechizite, nrRechizite);
		ghiozdanulMeu.add(caiet1);
		ghiozdanulMeu.add(caiet2);
		ghiozdanulMeu.add(manual);

		System.out.println("numarul de rechizite din ghiozdan e " + ghiozdanulMeu.getNrRechizite());
		System.out.println("numarul de manuale din ghiozdan e " + ghiozdanulMeu.getNrManuale());
		System.out.println("numarul de caiete din ghiozdan e " + ghiozdanulMeu.getNrCaiete());

		System.out.println("Toate rehizitele: ");
		ghiozdanulMeu.listItems();
		System.out.println();

		System.out.println("Toate caietele: ");
		ghiozdanulMeu.listCaiet();

		System.out.println();
		System.out.println("Toate manuale: ");
		ghiozdanulMeu.listManual();

	}
}