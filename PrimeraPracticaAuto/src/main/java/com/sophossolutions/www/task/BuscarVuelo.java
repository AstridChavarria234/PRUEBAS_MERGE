package com.sophossolutions.www.task;

import com.sophossolutions.www.userinterfaces.InicioDespegar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class BuscarVuelo implements Task {

	private String origen;
	private String destino;
	private static final String INICIOVUELO = "Mié, 29 ene 2020";
	private static final String FINVUELO = "Vie, 31 ene 2020";

	public BuscarVuelo(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}



	public BuscarVuelo(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}

	public BuscarVuelo(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}
	public BuscarVuelo(String origen, String destino) {
		this.origen = origen;
		this.destino = destino;
	}


	public static BuscarVuelo seleccionarVuelo(String origen, String destino) {
		

return Tasks.instrumented(BuscarVuelo.class, origen, destino);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioDespegar.VUELOS), Enter.theValue(origen).into(InicioDespegar.ORIG),
				Enter.theValue(destino).into(InicioDespegar.DESTINO), Click.on(InicioDespegar.BUSCARVUELO));
	}

}
