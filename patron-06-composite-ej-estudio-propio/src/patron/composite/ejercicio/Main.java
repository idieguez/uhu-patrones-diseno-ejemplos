package patron.composite.ejercicio;

import java.util.List;




public class Main {
	
	public static void main(String[] args) {
		
		// Universidades de Andalucía.
		ElementoEducativo uniAndalucia = new Universidad("Universidades de Andalucía");
		
		
		
		
		// Universidad de Huelva.
		ElementoEducativo uniHuelva = new Universidad("Universidad de Huelva");
		uniAndalucia.addElementoEducativoHijo(uniHuelva);
		
		
		// Universidad de Huelva: Campus El Carmen.
		ElementoEducativo uniHuelvaElCarmen = new Universidad("Campus El Carmen");
		uniHuelva.addElementoEducativoHijo(uniHuelvaElCarmen);
		
		ElementoEducativo depSTSSP = new DepartamentoDocencia("Departamento Docencia de Sociología, Trabajo Social y Salud Pública");
		uniHuelvaElCarmen.addElementoEducativoHijo(depSTSSP);
		ElementoEducativo depQ = new DepartamentoDocencia("Departamento Docencia de Química");
		uniHuelvaElCarmen.addElementoEducativoHijo(depQ);
		
		
		// Universidad de Huelva: Campus La Rábida.
		ElementoEducativo uniHuelvaLaRabida = new Universidad("Campus La Rábida");
		uniHuelva.addElementoEducativoHijo(uniHuelvaLaRabida);
		
		ElementoEducativo depDTI = new DepartamentoDocencia("Departamento Docencia de Tecnologías de la Información");
		uniHuelvaLaRabida.addElementoEducativoHijo(depDTI);
		ElementoEducativo depDIESIA = new DepartamentoDocencia("Departamento Docencia de Ingeniería Electrónica, de Sistemas Informáticos y Automática");
		uniHuelvaLaRabida.addElementoEducativoHijo(depDIESIA);
		ElementoEducativo depSIMD = new DepartamentoInvestigacion("Departamento Investigación de Sistemas Inteligentes y Minería de Datos");
		uniHuelvaLaRabida.addElementoEducativoHijo(depSIMD);
		
		
		// Universidad de Huelva: Campus La Merced.
		ElementoEducativo uniHuelvaLaMerced = new Universidad("Campus La Merced");
		uniHuelva.addElementoEducativoHijo(uniHuelvaLaMerced);
		
		ElementoEducativo depDEM = new DepartamentoDocencia("Departamento Docencia de Dirección de Empresas y Marketing");
		uniHuelvaLaMerced.addElementoEducativoHijo(depDEM);
		
		
		
		
		// Universidad de Sevilla.
		ElementoEducativo uniSevilla = new Universidad("Universidad de Sevilla");
		uniAndalucia.addElementoEducativoHijo(uniSevilla);
		
		
		// Universidad de Sevilla: Campus Fábrica de Tabacos.
		ElementoEducativo uniSevillaFabricaTabacos = new Universidad("Campus Fábrica de Tabacos");
		uniSevilla.addElementoEducativoHijo(uniSevillaFabricaTabacos);
		
		ElementoEducativo depDFT = new DepartamentoDocencia("Departamento Docencia de Fábrica de Tabacos");
		uniSevillaFabricaTabacos.addElementoEducativoHijo(depDFT);
		
		ElementoEducativo depIFT = new DepartamentoInvestigacion("Departamento Investigación de Fábrica de Tabacos");
		uniSevillaFabricaTabacos.addElementoEducativoHijo(depIFT);
		
		
		// Universidad de Sevilla: Campus Centro.
		ElementoEducativo uniSevillaCentro = new Universidad("Campus Centro");
		uniSevilla.addElementoEducativoHijo(uniSevillaCentro);
		
		ElementoEducativo depDC = new DepartamentoDocencia("Departamento Docencia de Centro");
		uniSevillaCentro.addElementoEducativoHijo(depDC);
		
		ElementoEducativo depIC = new DepartamentoInvestigacion("Departamento Investigación de Centro");
		uniSevillaCentro.addElementoEducativoHijo(depIC);
		
		
		// Universidad de Sevilla: Campus Reina Mercedes.
		ElementoEducativo uniSevillaReinaMercedes = new Universidad("Campus Reina Mercedes");
		uniSevilla.addElementoEducativoHijo(uniSevillaReinaMercedes);
		
		ElementoEducativo depDRM = new DepartamentoDocencia("Departamento Docencia de Reina Mercedes");
		uniSevillaReinaMercedes.addElementoEducativoHijo(depDRM);
		
		ElementoEducativo depIRM = new DepartamentoInvestigacion("Departamento Investigación de Reina Mercedes");
		uniSevillaReinaMercedes.addElementoEducativoHijo(depIRM);
		
		
		// Universidad de Sevilla: Campus Ramón y Cajal.
		ElementoEducativo uniSevillaRamonYCajal = new Universidad("Campus Ramón y Cajal");
		uniSevilla.addElementoEducativoHijo(uniSevillaRamonYCajal);
		
		ElementoEducativo depDRC = new DepartamentoDocencia("Departamento Docencia de Ramón y Cajal");
		uniSevillaRamonYCajal.addElementoEducativoHijo(depDRC);
		
		ElementoEducativo depIRC = new DepartamentoInvestigacion("Departamento Investigación de Ramón y Cajal");
		uniSevillaRamonYCajal.addElementoEducativoHijo(depIRC);
		
		
		// Universidad de Sevilla: Campus Pirotecnia.
		ElementoEducativo uniSevillaPirotecnia = new Universidad("Campus Pirotecnia");
		uniSevilla.addElementoEducativoHijo(uniSevillaPirotecnia);
		
		ElementoEducativo depDP = new DepartamentoDocencia("Departamento Docencia de Pirotecnia");
		uniSevillaPirotecnia.addElementoEducativoHijo(depDP);
		
		ElementoEducativo depIP = new DepartamentoInvestigacion("Departamento Investigación de Pirotecnia");
		uniSevillaPirotecnia.addElementoEducativoHijo(depIP);
		
		
		// Universidad de Sevilla: Campus Macarena.
		ElementoEducativo uniSevillaMacarena = new Universidad("Campus Macarena");
		uniSevilla.addElementoEducativoHijo(uniSevillaMacarena);
		
		ElementoEducativo depDM = new DepartamentoDocencia("Departamento Docencia de Macarena");
		uniSevillaMacarena.addElementoEducativoHijo(depDM);
		
		ElementoEducativo depIM = new DepartamentoInvestigacion("Departamento Investigación de Macarena");
		uniSevillaMacarena.addElementoEducativoHijo(depIM);
		
		
		// Universidad de Sevilla: Campus Cartuja.
		ElementoEducativo uniSevillaCartuja = new Universidad("Campus Cartuja");
		uniSevilla.addElementoEducativoHijo(uniSevillaCartuja);
		
		ElementoEducativo depDCt = new DepartamentoDocencia("Departamento Docencia de Cartuja");
		uniSevillaCartuja.addElementoEducativoHijo(depDCt);
		
		ElementoEducativo depICt = new DepartamentoInvestigacion("Departamento Investigación de Cartuja");
		uniSevillaCartuja.addElementoEducativoHijo(depICt);
		
		
		// Universidad de Sevilla: Campus Los Remedios.
		ElementoEducativo uniSevillaLosRemedios = new Universidad("Campus Los Remedios");
		uniSevilla.addElementoEducativoHijo(uniSevillaLosRemedios);
		
		ElementoEducativo depDLR = new DepartamentoDocencia("Departamento Docencia de Los Remedios");
		uniSevillaLosRemedios.addElementoEducativoHijo(depDLR);
		
		ElementoEducativo depILR = new DepartamentoInvestigacion("Departamento Investigación de Los Remedios");
		uniSevillaLosRemedios.addElementoEducativoHijo(depILR);
		
		
		
		
		// Mostrar toda la información.
		mostrarUniversidad(uniAndalucia, 0);
		
	}
	
	
	
	
	private static void mostrarUniversidad(ElementoEducativo universidad, int nivel) {
		
		System.out.println(" ".repeat(nivel * 2) + universidad.getNombre());
		
		List<ElementoEducativo> elementosEducativosHijos = universidad.getElementosEducativosHijos();
		if (elementosEducativosHijos != null) {
			for (ElementoEducativo elementoEducativoHijo : elementosEducativosHijos) {
				mostrarUniversidad(elementoEducativoHijo, nivel + 1);
			}
		}
		
	}

}
