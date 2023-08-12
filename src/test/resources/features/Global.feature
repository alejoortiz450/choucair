#language:es
# Autor: Alejandro Ortiz Hurtado
@stories
Característica: Acceder a pagina Web Utest


  @EscenarioConEjemplos
  Escenario: Acceder a la Web Utest
    Dado que alguien quiera acceder a la pagina Utest
    Cuando el realiza el registro en la pagina
      | strName | strLastName | strEmail | strPassword | strConfirmPassword |
      | Alejandro | Ortiz Hurtado | alejoortiz450@gmail.com | Passwordtest1* | Passwordtest1* |
    Entonces el verifica que se carga la informacion correctamente Complete Setup