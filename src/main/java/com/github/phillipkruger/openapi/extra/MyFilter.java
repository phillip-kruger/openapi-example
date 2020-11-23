package com.github.phillipkruger.openapi.extra;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.microprofile.openapi.OASFilter;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.media.Schema;

import io.smallrye.openapi.api.models.ComponentsImpl;
import io.smallrye.openapi.api.models.media.SchemaImpl;

public class MyFilter implements OASFilter {
    
    @Override
    public void filterOpenAPI(OpenAPI openAPI) {
        if (openAPI.getComponents() == null) {
            openAPI.setComponents(new ComponentsImpl());
        }
        openAPI.getComponents().addSchema("MyOwnObject", createMyOwnObject());
        
    }

    private Schema createMyOwnObject() {
        Schema schema = new SchemaImpl("MyOwnObject");
        schema.setType(Schema.SchemaType.OBJECT);
        schema.setProperties(createProperties());
        return schema;
    }

    private Map<String, Schema> createProperties() {
        Map<String, Schema> map = new HashMap<>();
        map.put("foo", createFoo());
        return map;
    }

    private Schema createFoo() {
        Schema schema = new SchemaImpl("foo");
        schema.setType(Schema.SchemaType.STRING);
        schema.setNullable(Boolean.TRUE);
        return schema;
    }

}
