import io.cucumber.groovy.PendingException

import static io.cucumber.groovy.Hooks.*
import static io.cucumber.groovy.EN.*

Given(~/^a precondition$/) { ->
    throw new PendingException()
}