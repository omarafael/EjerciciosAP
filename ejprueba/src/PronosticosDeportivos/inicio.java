package PronosticosDeportivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import PronosticosDeportivos.Equipo;
import PronosticosDeportivos.Partido;
import PronosticosDeportivos.Pronosticos;
import PronosticosDeportivos.ResultadoEnum;

public class inicio {
	
	public static void main(String[] args) {
		String archivopartidos="partidos.csv";
		String archivopronisticos="pronosticos.csv";
		try {
		
			List<String> listapart=Files.readAllLines(Paths.get(archivopartidos));
			String[] datospart1=listapart.get(1).split(";");                          //1;Argentina;Seleccionado;1;2;2;Arabia Saudita;Seleccionado
			String[] datospart2=listapart.get(2).split(";");                          //3;Polonia;Seleccionado;0;0;4;México;Seleccionado
		
			
			Equipo Equipo1 = new Equipo(datospart1[1], datospart1[2]);         //ingresa arg
			Equipo Equipo2 = new Equipo(datospart1[6], datospart1[7]);          // ingresa arabia
			Equipo Equipo3 = new Equipo(datospart2[1], datospart2[2]);          // ingresa polonia
			Equipo Equipo4 = new Equipo(datospart2[6], datospart2[7]);          // ingresa mexico
			
			System.out.println(Equipo1.getNombre());
			
			
			
			
			
			
			
			
			
			
		
		}catch(IOException e) {
			System.out.println("error" + e);
		}
	}
	
	
}

