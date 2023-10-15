@Grab('io.swagger:swagger-parser:2.0.12')
import io.swagger.parser.SwaggerParser

// Replace with the URL of your Swagger UI
def swaggerUiUrl = "https://developer.dealerware.com/api_v3.html"

// Parse Swagger definition from Swagger UI
def swaggerJson = new SwaggerParser().read(swaggerUiUrl)

// Extract API endpoints from Swagger definition
def paths = swaggerJson.paths

// Iterate through each API endpoint
paths.each { path, pathDefinition ->
    println("API Endpoint: $path")
    
    pathDefinition.each { method, methodDefinition ->
        println("  HTTP Method: $method")
    }
}
