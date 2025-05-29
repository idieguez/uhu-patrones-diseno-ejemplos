package patron.composite.ejercicio;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		// Universidades de Andalucía.
		ElementoEducativo uniAndalucia = new Universidad("Universidades de Andalucía");
		
		
		
		
		// Universidad de Huelva.
		ElementoEducativo uniHuelva = new Universidad("Universidad de Huelva");
		uniAndalucia.agregaHoja(uniHuelva);
		
		
		// Universidad de Huelva: Campus El Carmen.
		ElementoEducativo uniHuelvaElCarmen = new Universidad("Campus El Carmen");
		uniHuelva.agregaHoja(uniHuelvaElCarmen);
		
		ElementoEducativo depSTSSP = new DepartamentoDocencia("Departamento Docencia de Sociología, Trabajo Social y Salud Pública");
		uniHuelvaElCarmen.agregaHoja(depSTSSP);
		ElementoEducativo depQ = new DepartamentoDocencia("Departamento Docencia de Química");
		uniHuelvaElCarmen.agregaHoja(depQ);
		
		
		// Universidad de Huelva: Campus La Rábida.
		ElementoEducativo uniHuelvaLaRabida = new Universidad("Campus La Rábida");
		uniHuelva.agregaHoja(uniHuelvaLaRabida);
		
		ElementoEducativo depDTI = new DepartamentoDocencia("Departamento Docencia de Tecnologías de la Información");
		uniHuelvaLaRabida.agregaHoja(depDTI);
		ElementoEducativo depDIESIA = new DepartamentoDocencia("Departamento Docencia de Ingeniería Electrónica, de Sistemas Informáticos y Automática");
		uniHuelvaLaRabida.agregaHoja(depDIESIA);
		ElementoEducativo depSIMD = new DepartamentoInvestigacion("Departamento Investigación de Sistemas Inteligentes y Minería de Datos");
		uniHuelvaLaRabida.agregaHoja(depSIMD);
		
		
		// Universidad de Huelva: Campus La Merced.
		ElementoEducativo uniHuelvaLaMerced = new Universidad("Campus La Merced");
		uniHuelva.agregaHoja(uniHuelvaLaMerced);
		
		ElementoEducativo depDEM = new DepartamentoDocencia("Departamento Docencia de Dirección de Empresas y Marketing");
		uniHuelvaLaMerced.agregaHoja(depDEM);
		
		
		
		
		// Universidad de Sevilla.
		ElementoEducativo uniSevilla = new Universidad("Universidad de Sevilla");
		uniAndalucia.agregaHoja(uniSevilla);
		
		
		// Universidad de Sevilla: Campus Fábrica de Tabacos.
		ElementoEducativo uniSevillaFabricaTabacos = new Universidad("Campus Fábrica de Tabacos");
		uniSevilla.agregaHoja(uniSevillaFabricaTabacos);
		
		ElementoEducativo depDFT = new DepartamentoDocencia("Departamento Docencia de Fábrica de Tabacos");
		uniSevillaFabricaTabacos.agregaHoja(depDFT);
		
		ElementoEducativo depIFT = new DepartamentoInvestigacion("Departamento Investigación de Fábrica de Tabacos");
		uniSevillaFabricaTabacos.agregaHoja(depIFT);
		
		
		// Universidad de Sevilla: Campus Centro.
		ElementoEducativo uniSevillaCentro = new Universidad("Campus Centro");
		uniSevilla.agregaHoja(uniSevillaCentro);
		
		ElementoEducativo depDC = new DepartamentoDocencia("Departamento Docencia de Centro");
		uniSevillaCentro.agregaHoja(depDC);
		
		ElementoEducativo depIC = new DepartamentoInvestigacion("Departamento Investigación de Centro");
		uniSevillaCentro.agregaHoja(depIC);
		
		
		// Universidad de Sevilla: Campus Reina Mercedes.
		ElementoEducativo uniSevillaReinaMercedes = new Universidad("Campus Reina Mercedes");
		uniSevilla.agregaHoja(uniSevillaReinaMercedes);
		
		ElementoEducativo depDRM = new DepartamentoDocencia("Departamento Docencia de Reina Mercedes");
		uniSevillaReinaMercedes.agregaHoja(depDRM);
		
		ElementoEducativo depIRM = new DepartamentoInvestigacion("Departamento Investigación de Reina Mercedes");
		uniSevillaReinaMercedes.agregaHoja(depIRM);
		
		
		// Universidad de Sevilla: Campus Ramón y Cajal.
		ElementoEducativo uniSevillaRamonYCajal = new Universidad("Campus Ramón y Cajal");
		uniSevilla.agregaHoja(uniSevillaRamonYCajal);
		
		ElementoEducativo depDRC = new DepartamentoDocencia("Departamento Docencia de Ramón y Cajal");
		uniSevillaRamonYCajal.agregaHoja(depDRC);
		
		ElementoEducativo depIRC = new DepartamentoInvestigacion("Departamento Investigación de Ramón y Cajal");
		uniSevillaRamonYCajal.agregaHoja(depIRC);
		
		
		// Universidad de Sevilla: Campus Pirotecnia.
		ElementoEducativo uniSevillaPirotecnia = new Universidad("Campus Pirotecnia");
		uniSevilla.agregaHoja(uniSevillaPirotecnia);
		
		ElementoEducativo depDP = new DepartamentoDocencia("Departamento Docencia de Pirotecnia");
		uniSevillaPirotecnia.agregaHoja(depDP);
		
		ElementoEducativo depIP = new DepartamentoInvestigacion("Departamento Investigación de Pirotecnia");
		uniSevillaPirotecnia.agregaHoja(depIP);
		
		
		// Universidad de Sevilla: Campus Macarena.
		ElementoEducativo uniSevillaMacarena = new Universidad("Campus Macarena");
		uniSevilla.agregaHoja(uniSevillaMacarena);
		
		ElementoEducativo depDM = new DepartamentoDocencia("Departamento Docencia de Macarena");
		uniSevillaMacarena.agregaHoja(depDM);
		
		ElementoEducativo depIM = new DepartamentoInvestigacion("Departamento Investigación de Macarena");
		uniSevillaMacarena.agregaHoja(depIM);
		
		
		// Universidad de Sevilla: Campus Cartuja.
		ElementoEducativo uniSevillaCartuja = new Universidad("Campus Cartuja");
		uniSevilla.agregaHoja(uniSevillaCartuja);
		
		ElementoEducativo depDCt = new DepartamentoDocencia("Departamento Docencia de Cartuja");
		uniSevillaCartuja.agregaHoja(depDCt);
		
		ElementoEducativo depICt = new DepartamentoInvestigacion("Departamento Investigación de Cartuja");
		uniSevillaCartuja.agregaHoja(depICt);
		
		
		// Universidad de Sevilla: Campus Los Remedios.
		ElementoEducativo uniSevillaLosRemedios = new Universidad("Campus Los Remedios");
		uniSevilla.agregaHoja(uniSevillaLosRemedios);
		
		ElementoEducativo depDLR = new DepartamentoDocencia("Departamento Docencia de Los Remedios");
		uniSevillaLosRemedios.agregaHoja(depDLR);
		
		ElementoEducativo depILR = new DepartamentoInvestigacion("Departamento Investigación de Los Remedios");
		uniSevillaLosRemedios.agregaHoja(depILR);
		
		
		
		
		// Mostrar toda la información.
		mostrarUniversidad(uniAndalucia, 0);
		
	}
	
	
	
	
	private static void mostrarUniversidad(ElementoEducativo universidad, int nivel) {
		
		System.out.println(" ".repeat(nivel * 2) + universidad.getNombreElemento());
		
		List<ElementoEducativo> hojasUniversidad = universidad.obtenerHojas();
		if (hojasUniversidad != null) {
			for (ElementoEducativo hojaUniversidad : hojasUniversidad) {
				if (hojaUniversidad != null) {
					mostrarUniversidad(hojaUniversidad, nivel + 1);
				}
			}
		}
		
	}

}
