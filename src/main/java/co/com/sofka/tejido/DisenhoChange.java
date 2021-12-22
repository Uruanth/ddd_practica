package co.com.sofka.tejido;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tejido.eventos.ClienteActualizado;
import co.com.sofka.tejido.eventos.DisenhoCreado;
import co.com.sofka.tejido.eventos.SolicitudGenerada;

public class DisenhoChange extends EventChange {
    public DisenhoChange(Disenho disenho) {
        apply((DisenhoCreado event) -> {
            disenho.cliente = event.getCliente();
            disenho.solicitudCliente = event.getSolicitudCliente();
        });

        apply((ClienteActualizado event) -> {
           disenho.cliente.actualizarCliente(
                   event.getNombre(),
                   event.getContacto(),
                   event.getCedula()
           );
        });

        apply((SolicitudGenerada event) -> {
            disenho.solicitudCliente.actualizarPrototipo(
                    event.getNombre(),
                    event.getCaracteristicas(),
                    event.getMateriales()
            );
        });

    }
}
