
package hotelws1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hotelws1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EliminarHabitacion_QNAME = new QName("http://PROYECTOWS/", "EliminarHabitacion");
    private final static QName _EliminarHabitacionResponse_QNAME = new QName("http://PROYECTOWS/", "EliminarHabitacionResponse");
    private final static QName _Eliminarpersonas_QNAME = new QName("http://PROYECTOWS/", "Eliminarpersonas");
    private final static QName _EliminarpersonasResponse_QNAME = new QName("http://PROYECTOWS/", "EliminarpersonasResponse");
    private final static QName _Eliminarreserva_QNAME = new QName("http://PROYECTOWS/", "Eliminarreserva");
    private final static QName _EliminarreservaResponse_QNAME = new QName("http://PROYECTOWS/", "EliminarreservaResponse");
    private final static QName _IngresarHabitacion_QNAME = new QName("http://PROYECTOWS/", "IngresarHabitacion");
    private final static QName _IngresarHabitacionResponse_QNAME = new QName("http://PROYECTOWS/", "IngresarHabitacionResponse");
    private final static QName _IngresarReserva_QNAME = new QName("http://PROYECTOWS/", "IngresarReserva");
    private final static QName _IngresarReservaResponse_QNAME = new QName("http://PROYECTOWS/", "IngresarReservaResponse");
    private final static QName _Ingresarpersona_QNAME = new QName("http://PROYECTOWS/", "Ingresarpersona");
    private final static QName _IngresarpersonaResponse_QNAME = new QName("http://PROYECTOWS/", "IngresarpersonaResponse");
    private final static QName _ModificaPersona_QNAME = new QName("http://PROYECTOWS/", "ModificaPersona");
    private final static QName _ModificaPersonaResponse_QNAME = new QName("http://PROYECTOWS/", "ModificaPersonaResponse");
    private final static QName _ModificarHabitacion_QNAME = new QName("http://PROYECTOWS/", "ModificarHabitacion");
    private final static QName _ModificarHabitacionResponse_QNAME = new QName("http://PROYECTOWS/", "ModificarHabitacionResponse");
    private final static QName _Modificarreserva_QNAME = new QName("http://PROYECTOWS/", "Modificarreserva");
    private final static QName _ModificarreservaResponse_QNAME = new QName("http://PROYECTOWS/", "ModificarreservaResponse");
    private final static QName _ObtenerHabitacion_QNAME = new QName("http://PROYECTOWS/", "ObtenerHabitacion");
    private final static QName _ObtenerHabitacionResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenerHabitacionResponse");
    private final static QName _ObtenerHabitaciones_QNAME = new QName("http://PROYECTOWS/", "ObtenerHabitaciones");
    private final static QName _ObtenerHabitacionesResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenerHabitacionesResponse");
    private final static QName _ObtenerTodasHabitacion_QNAME = new QName("http://PROYECTOWS/", "ObtenerTodasHabitacion");
    private final static QName _ObtenerTodasHabitacionResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenerTodasHabitacionResponse");
    private final static QName _ObtenerTodasHabitacionescocpuadas_QNAME = new QName("http://PROYECTOWS/", "ObtenerTodasHabitacionescocpuadas");
    private final static QName _ObtenerTodasHabitacionescocpuadasResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenerTodasHabitacionescocpuadasResponse");
    private final static QName _Obtenerpersonas_QNAME = new QName("http://PROYECTOWS/", "Obtenerpersonas");
    private final static QName _ObtenerpersonasResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenerpersonasResponse");
    private final static QName _Obtenerreservan_QNAME = new QName("http://PROYECTOWS/", "Obtenerreservan");
    private final static QName _ObtenerreservanResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenerreservanResponse");
    private final static QName _Obtenertodasreservan_QNAME = new QName("http://PROYECTOWS/", "Obtenertodasreservan");
    private final static QName _ObtenertodasreservanResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenertodasreservanResponse");
    private final static QName _Obtenertotadaspersonas_QNAME = new QName("http://PROYECTOWS/", "Obtenertotadaspersonas");
    private final static QName _ObtenertotadaspersonasResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenertotadaspersonasResponse");
    private final static QName _Obtenertotadaspersonastrabajadoras_QNAME = new QName("http://PROYECTOWS/", "Obtenertotadaspersonastrabajadoras");
    private final static QName _ObtenertotadaspersonastrabajadorasResponse_QNAME = new QName("http://PROYECTOWS/", "ObtenertotadaspersonastrabajadorasResponse");
    private final static QName _Inicarsecion_QNAME = new QName("http://PROYECTOWS/", "inicarsecion");
    private final static QName _InicarsecionResponse_QNAME = new QName("http://PROYECTOWS/", "inicarsecionResponse");
    private final static QName _Mostrarfecha_QNAME = new QName("http://PROYECTOWS/", "mostrarfecha");
    private final static QName _MostrarfechaResponse_QNAME = new QName("http://PROYECTOWS/", "mostrarfechaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hotelws1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarHabitacion }
     * 
     */
    public EliminarHabitacion createEliminarHabitacion() {
        return new EliminarHabitacion();
    }

    /**
     * Create an instance of {@link EliminarHabitacionResponse }
     * 
     */
    public EliminarHabitacionResponse createEliminarHabitacionResponse() {
        return new EliminarHabitacionResponse();
    }

    /**
     * Create an instance of {@link Eliminarpersonas }
     * 
     */
    public Eliminarpersonas createEliminarpersonas() {
        return new Eliminarpersonas();
    }

    /**
     * Create an instance of {@link EliminarpersonasResponse }
     * 
     */
    public EliminarpersonasResponse createEliminarpersonasResponse() {
        return new EliminarpersonasResponse();
    }

    /**
     * Create an instance of {@link Eliminarreserva }
     * 
     */
    public Eliminarreserva createEliminarreserva() {
        return new Eliminarreserva();
    }

    /**
     * Create an instance of {@link EliminarreservaResponse }
     * 
     */
    public EliminarreservaResponse createEliminarreservaResponse() {
        return new EliminarreservaResponse();
    }

    /**
     * Create an instance of {@link IngresarHabitacion }
     * 
     */
    public IngresarHabitacion createIngresarHabitacion() {
        return new IngresarHabitacion();
    }

    /**
     * Create an instance of {@link IngresarHabitacionResponse }
     * 
     */
    public IngresarHabitacionResponse createIngresarHabitacionResponse() {
        return new IngresarHabitacionResponse();
    }

    /**
     * Create an instance of {@link IngresarReserva }
     * 
     */
    public IngresarReserva createIngresarReserva() {
        return new IngresarReserva();
    }

    /**
     * Create an instance of {@link IngresarReservaResponse }
     * 
     */
    public IngresarReservaResponse createIngresarReservaResponse() {
        return new IngresarReservaResponse();
    }

    /**
     * Create an instance of {@link Ingresarpersona }
     * 
     */
    public Ingresarpersona createIngresarpersona() {
        return new Ingresarpersona();
    }

    /**
     * Create an instance of {@link IngresarpersonaResponse }
     * 
     */
    public IngresarpersonaResponse createIngresarpersonaResponse() {
        return new IngresarpersonaResponse();
    }

    /**
     * Create an instance of {@link ModificaPersona }
     * 
     */
    public ModificaPersona createModificaPersona() {
        return new ModificaPersona();
    }

    /**
     * Create an instance of {@link ModificaPersonaResponse }
     * 
     */
    public ModificaPersonaResponse createModificaPersonaResponse() {
        return new ModificaPersonaResponse();
    }

    /**
     * Create an instance of {@link ModificarHabitacion }
     * 
     */
    public ModificarHabitacion createModificarHabitacion() {
        return new ModificarHabitacion();
    }

    /**
     * Create an instance of {@link ModificarHabitacionResponse }
     * 
     */
    public ModificarHabitacionResponse createModificarHabitacionResponse() {
        return new ModificarHabitacionResponse();
    }

    /**
     * Create an instance of {@link Modificarreserva }
     * 
     */
    public Modificarreserva createModificarreserva() {
        return new Modificarreserva();
    }

    /**
     * Create an instance of {@link ModificarreservaResponse }
     * 
     */
    public ModificarreservaResponse createModificarreservaResponse() {
        return new ModificarreservaResponse();
    }

    /**
     * Create an instance of {@link ObtenerHabitacion }
     * 
     */
    public ObtenerHabitacion createObtenerHabitacion() {
        return new ObtenerHabitacion();
    }

    /**
     * Create an instance of {@link ObtenerHabitacionResponse }
     * 
     */
    public ObtenerHabitacionResponse createObtenerHabitacionResponse() {
        return new ObtenerHabitacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerHabitaciones }
     * 
     */
    public ObtenerHabitaciones createObtenerHabitaciones() {
        return new ObtenerHabitaciones();
    }

    /**
     * Create an instance of {@link ObtenerHabitacionesResponse }
     * 
     */
    public ObtenerHabitacionesResponse createObtenerHabitacionesResponse() {
        return new ObtenerHabitacionesResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodasHabitacion }
     * 
     */
    public ObtenerTodasHabitacion createObtenerTodasHabitacion() {
        return new ObtenerTodasHabitacion();
    }

    /**
     * Create an instance of {@link ObtenerTodasHabitacionResponse }
     * 
     */
    public ObtenerTodasHabitacionResponse createObtenerTodasHabitacionResponse() {
        return new ObtenerTodasHabitacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodasHabitacionescocpuadas }
     * 
     */
    public ObtenerTodasHabitacionescocpuadas createObtenerTodasHabitacionescocpuadas() {
        return new ObtenerTodasHabitacionescocpuadas();
    }

    /**
     * Create an instance of {@link ObtenerTodasHabitacionescocpuadasResponse }
     * 
     */
    public ObtenerTodasHabitacionescocpuadasResponse createObtenerTodasHabitacionescocpuadasResponse() {
        return new ObtenerTodasHabitacionescocpuadasResponse();
    }

    /**
     * Create an instance of {@link Obtenerpersonas }
     * 
     */
    public Obtenerpersonas createObtenerpersonas() {
        return new Obtenerpersonas();
    }

    /**
     * Create an instance of {@link ObtenerpersonasResponse }
     * 
     */
    public ObtenerpersonasResponse createObtenerpersonasResponse() {
        return new ObtenerpersonasResponse();
    }

    /**
     * Create an instance of {@link Obtenerreservan }
     * 
     */
    public Obtenerreservan createObtenerreservan() {
        return new Obtenerreservan();
    }

    /**
     * Create an instance of {@link ObtenerreservanResponse }
     * 
     */
    public ObtenerreservanResponse createObtenerreservanResponse() {
        return new ObtenerreservanResponse();
    }

    /**
     * Create an instance of {@link Obtenertodasreservan }
     * 
     */
    public Obtenertodasreservan createObtenertodasreservan() {
        return new Obtenertodasreservan();
    }

    /**
     * Create an instance of {@link ObtenertodasreservanResponse }
     * 
     */
    public ObtenertodasreservanResponse createObtenertodasreservanResponse() {
        return new ObtenertodasreservanResponse();
    }

    /**
     * Create an instance of {@link Obtenertotadaspersonas }
     * 
     */
    public Obtenertotadaspersonas createObtenertotadaspersonas() {
        return new Obtenertotadaspersonas();
    }

    /**
     * Create an instance of {@link ObtenertotadaspersonasResponse }
     * 
     */
    public ObtenertotadaspersonasResponse createObtenertotadaspersonasResponse() {
        return new ObtenertotadaspersonasResponse();
    }

    /**
     * Create an instance of {@link Obtenertotadaspersonastrabajadoras }
     * 
     */
    public Obtenertotadaspersonastrabajadoras createObtenertotadaspersonastrabajadoras() {
        return new Obtenertotadaspersonastrabajadoras();
    }

    /**
     * Create an instance of {@link ObtenertotadaspersonastrabajadorasResponse }
     * 
     */
    public ObtenertotadaspersonastrabajadorasResponse createObtenertotadaspersonastrabajadorasResponse() {
        return new ObtenertotadaspersonastrabajadorasResponse();
    }

    /**
     * Create an instance of {@link Inicarsecion }
     * 
     */
    public Inicarsecion createInicarsecion() {
        return new Inicarsecion();
    }

    /**
     * Create an instance of {@link InicarsecionResponse }
     * 
     */
    public InicarsecionResponse createInicarsecionResponse() {
        return new InicarsecionResponse();
    }

    /**
     * Create an instance of {@link Mostrarfecha }
     * 
     */
    public Mostrarfecha createMostrarfecha() {
        return new Mostrarfecha();
    }

    /**
     * Create an instance of {@link MostrarfechaResponse }
     * 
     */
    public MostrarfechaResponse createMostrarfechaResponse() {
        return new MostrarfechaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarHabitacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarHabitacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "EliminarHabitacion")
    public JAXBElement<EliminarHabitacion> createEliminarHabitacion(EliminarHabitacion value) {
        return new JAXBElement<EliminarHabitacion>(_EliminarHabitacion_QNAME, EliminarHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarHabitacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarHabitacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "EliminarHabitacionResponse")
    public JAXBElement<EliminarHabitacionResponse> createEliminarHabitacionResponse(EliminarHabitacionResponse value) {
        return new JAXBElement<EliminarHabitacionResponse>(_EliminarHabitacionResponse_QNAME, EliminarHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminarpersonas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Eliminarpersonas }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Eliminarpersonas")
    public JAXBElement<Eliminarpersonas> createEliminarpersonas(Eliminarpersonas value) {
        return new JAXBElement<Eliminarpersonas>(_Eliminarpersonas_QNAME, Eliminarpersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarpersonasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarpersonasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "EliminarpersonasResponse")
    public JAXBElement<EliminarpersonasResponse> createEliminarpersonasResponse(EliminarpersonasResponse value) {
        return new JAXBElement<EliminarpersonasResponse>(_EliminarpersonasResponse_QNAME, EliminarpersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminarreserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Eliminarreserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Eliminarreserva")
    public JAXBElement<Eliminarreserva> createEliminarreserva(Eliminarreserva value) {
        return new JAXBElement<Eliminarreserva>(_Eliminarreserva_QNAME, Eliminarreserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarreservaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarreservaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "EliminarreservaResponse")
    public JAXBElement<EliminarreservaResponse> createEliminarreservaResponse(EliminarreservaResponse value) {
        return new JAXBElement<EliminarreservaResponse>(_EliminarreservaResponse_QNAME, EliminarreservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarHabitacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IngresarHabitacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "IngresarHabitacion")
    public JAXBElement<IngresarHabitacion> createIngresarHabitacion(IngresarHabitacion value) {
        return new JAXBElement<IngresarHabitacion>(_IngresarHabitacion_QNAME, IngresarHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarHabitacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IngresarHabitacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "IngresarHabitacionResponse")
    public JAXBElement<IngresarHabitacionResponse> createIngresarHabitacionResponse(IngresarHabitacionResponse value) {
        return new JAXBElement<IngresarHabitacionResponse>(_IngresarHabitacionResponse_QNAME, IngresarHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarReserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IngresarReserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "IngresarReserva")
    public JAXBElement<IngresarReserva> createIngresarReserva(IngresarReserva value) {
        return new JAXBElement<IngresarReserva>(_IngresarReserva_QNAME, IngresarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarReservaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IngresarReservaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "IngresarReservaResponse")
    public JAXBElement<IngresarReservaResponse> createIngresarReservaResponse(IngresarReservaResponse value) {
        return new JAXBElement<IngresarReservaResponse>(_IngresarReservaResponse_QNAME, IngresarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingresarpersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ingresarpersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Ingresarpersona")
    public JAXBElement<Ingresarpersona> createIngresarpersona(Ingresarpersona value) {
        return new JAXBElement<Ingresarpersona>(_Ingresarpersona_QNAME, Ingresarpersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarpersonaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IngresarpersonaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "IngresarpersonaResponse")
    public JAXBElement<IngresarpersonaResponse> createIngresarpersonaResponse(IngresarpersonaResponse value) {
        return new JAXBElement<IngresarpersonaResponse>(_IngresarpersonaResponse_QNAME, IngresarpersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificaPersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ModificaPersona")
    public JAXBElement<ModificaPersona> createModificaPersona(ModificaPersona value) {
        return new JAXBElement<ModificaPersona>(_ModificaPersona_QNAME, ModificaPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificaPersonaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificaPersonaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ModificaPersonaResponse")
    public JAXBElement<ModificaPersonaResponse> createModificaPersonaResponse(ModificaPersonaResponse value) {
        return new JAXBElement<ModificaPersonaResponse>(_ModificaPersonaResponse_QNAME, ModificaPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarHabitacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarHabitacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ModificarHabitacion")
    public JAXBElement<ModificarHabitacion> createModificarHabitacion(ModificarHabitacion value) {
        return new JAXBElement<ModificarHabitacion>(_ModificarHabitacion_QNAME, ModificarHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarHabitacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarHabitacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ModificarHabitacionResponse")
    public JAXBElement<ModificarHabitacionResponse> createModificarHabitacionResponse(ModificarHabitacionResponse value) {
        return new JAXBElement<ModificarHabitacionResponse>(_ModificarHabitacionResponse_QNAME, ModificarHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modificarreserva }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Modificarreserva }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Modificarreserva")
    public JAXBElement<Modificarreserva> createModificarreserva(Modificarreserva value) {
        return new JAXBElement<Modificarreserva>(_Modificarreserva_QNAME, Modificarreserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarreservaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarreservaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ModificarreservaResponse")
    public JAXBElement<ModificarreservaResponse> createModificarreservaResponse(ModificarreservaResponse value) {
        return new JAXBElement<ModificarreservaResponse>(_ModificarreservaResponse_QNAME, ModificarreservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerHabitacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerHabitacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerHabitacion")
    public JAXBElement<ObtenerHabitacion> createObtenerHabitacion(ObtenerHabitacion value) {
        return new JAXBElement<ObtenerHabitacion>(_ObtenerHabitacion_QNAME, ObtenerHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerHabitacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerHabitacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerHabitacionResponse")
    public JAXBElement<ObtenerHabitacionResponse> createObtenerHabitacionResponse(ObtenerHabitacionResponse value) {
        return new JAXBElement<ObtenerHabitacionResponse>(_ObtenerHabitacionResponse_QNAME, ObtenerHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerHabitaciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerHabitaciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerHabitaciones")
    public JAXBElement<ObtenerHabitaciones> createObtenerHabitaciones(ObtenerHabitaciones value) {
        return new JAXBElement<ObtenerHabitaciones>(_ObtenerHabitaciones_QNAME, ObtenerHabitaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerHabitacionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerHabitacionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerHabitacionesResponse")
    public JAXBElement<ObtenerHabitacionesResponse> createObtenerHabitacionesResponse(ObtenerHabitacionesResponse value) {
        return new JAXBElement<ObtenerHabitacionesResponse>(_ObtenerHabitacionesResponse_QNAME, ObtenerHabitacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasHabitacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerTodasHabitacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerTodasHabitacion")
    public JAXBElement<ObtenerTodasHabitacion> createObtenerTodasHabitacion(ObtenerTodasHabitacion value) {
        return new JAXBElement<ObtenerTodasHabitacion>(_ObtenerTodasHabitacion_QNAME, ObtenerTodasHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasHabitacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerTodasHabitacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerTodasHabitacionResponse")
    public JAXBElement<ObtenerTodasHabitacionResponse> createObtenerTodasHabitacionResponse(ObtenerTodasHabitacionResponse value) {
        return new JAXBElement<ObtenerTodasHabitacionResponse>(_ObtenerTodasHabitacionResponse_QNAME, ObtenerTodasHabitacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasHabitacionescocpuadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerTodasHabitacionescocpuadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerTodasHabitacionescocpuadas")
    public JAXBElement<ObtenerTodasHabitacionescocpuadas> createObtenerTodasHabitacionescocpuadas(ObtenerTodasHabitacionescocpuadas value) {
        return new JAXBElement<ObtenerTodasHabitacionescocpuadas>(_ObtenerTodasHabitacionescocpuadas_QNAME, ObtenerTodasHabitacionescocpuadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodasHabitacionescocpuadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerTodasHabitacionescocpuadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerTodasHabitacionescocpuadasResponse")
    public JAXBElement<ObtenerTodasHabitacionescocpuadasResponse> createObtenerTodasHabitacionescocpuadasResponse(ObtenerTodasHabitacionescocpuadasResponse value) {
        return new JAXBElement<ObtenerTodasHabitacionescocpuadasResponse>(_ObtenerTodasHabitacionescocpuadasResponse_QNAME, ObtenerTodasHabitacionescocpuadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenerpersonas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Obtenerpersonas }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Obtenerpersonas")
    public JAXBElement<Obtenerpersonas> createObtenerpersonas(Obtenerpersonas value) {
        return new JAXBElement<Obtenerpersonas>(_Obtenerpersonas_QNAME, Obtenerpersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerpersonasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerpersonasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerpersonasResponse")
    public JAXBElement<ObtenerpersonasResponse> createObtenerpersonasResponse(ObtenerpersonasResponse value) {
        return new JAXBElement<ObtenerpersonasResponse>(_ObtenerpersonasResponse_QNAME, ObtenerpersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenerreservan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Obtenerreservan }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Obtenerreservan")
    public JAXBElement<Obtenerreservan> createObtenerreservan(Obtenerreservan value) {
        return new JAXBElement<Obtenerreservan>(_Obtenerreservan_QNAME, Obtenerreservan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerreservanResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerreservanResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenerreservanResponse")
    public JAXBElement<ObtenerreservanResponse> createObtenerreservanResponse(ObtenerreservanResponse value) {
        return new JAXBElement<ObtenerreservanResponse>(_ObtenerreservanResponse_QNAME, ObtenerreservanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenertodasreservan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Obtenertodasreservan }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Obtenertodasreservan")
    public JAXBElement<Obtenertodasreservan> createObtenertodasreservan(Obtenertodasreservan value) {
        return new JAXBElement<Obtenertodasreservan>(_Obtenertodasreservan_QNAME, Obtenertodasreservan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenertodasreservanResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenertodasreservanResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenertodasreservanResponse")
    public JAXBElement<ObtenertodasreservanResponse> createObtenertodasreservanResponse(ObtenertodasreservanResponse value) {
        return new JAXBElement<ObtenertodasreservanResponse>(_ObtenertodasreservanResponse_QNAME, ObtenertodasreservanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenertotadaspersonas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Obtenertotadaspersonas }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Obtenertotadaspersonas")
    public JAXBElement<Obtenertotadaspersonas> createObtenertotadaspersonas(Obtenertotadaspersonas value) {
        return new JAXBElement<Obtenertotadaspersonas>(_Obtenertotadaspersonas_QNAME, Obtenertotadaspersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenertotadaspersonasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenertotadaspersonasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenertotadaspersonasResponse")
    public JAXBElement<ObtenertotadaspersonasResponse> createObtenertotadaspersonasResponse(ObtenertotadaspersonasResponse value) {
        return new JAXBElement<ObtenertotadaspersonasResponse>(_ObtenertotadaspersonasResponse_QNAME, ObtenertotadaspersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenertotadaspersonastrabajadoras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Obtenertotadaspersonastrabajadoras }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "Obtenertotadaspersonastrabajadoras")
    public JAXBElement<Obtenertotadaspersonastrabajadoras> createObtenertotadaspersonastrabajadoras(Obtenertotadaspersonastrabajadoras value) {
        return new JAXBElement<Obtenertotadaspersonastrabajadoras>(_Obtenertotadaspersonastrabajadoras_QNAME, Obtenertotadaspersonastrabajadoras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenertotadaspersonastrabajadorasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenertotadaspersonastrabajadorasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "ObtenertotadaspersonastrabajadorasResponse")
    public JAXBElement<ObtenertotadaspersonastrabajadorasResponse> createObtenertotadaspersonastrabajadorasResponse(ObtenertotadaspersonastrabajadorasResponse value) {
        return new JAXBElement<ObtenertotadaspersonastrabajadorasResponse>(_ObtenertotadaspersonastrabajadorasResponse_QNAME, ObtenertotadaspersonastrabajadorasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inicarsecion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Inicarsecion }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "inicarsecion")
    public JAXBElement<Inicarsecion> createInicarsecion(Inicarsecion value) {
        return new JAXBElement<Inicarsecion>(_Inicarsecion_QNAME, Inicarsecion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InicarsecionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InicarsecionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "inicarsecionResponse")
    public JAXBElement<InicarsecionResponse> createInicarsecionResponse(InicarsecionResponse value) {
        return new JAXBElement<InicarsecionResponse>(_InicarsecionResponse_QNAME, InicarsecionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mostrarfecha }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mostrarfecha }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "mostrarfecha")
    public JAXBElement<Mostrarfecha> createMostrarfecha(Mostrarfecha value) {
        return new JAXBElement<Mostrarfecha>(_Mostrarfecha_QNAME, Mostrarfecha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarfechaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MostrarfechaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://PROYECTOWS/", name = "mostrarfechaResponse")
    public JAXBElement<MostrarfechaResponse> createMostrarfechaResponse(MostrarfechaResponse value) {
        return new JAXBElement<MostrarfechaResponse>(_MostrarfechaResponse_QNAME, MostrarfechaResponse.class, null, value);
    }

}
