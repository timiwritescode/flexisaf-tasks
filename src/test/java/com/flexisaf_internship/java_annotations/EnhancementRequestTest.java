package com.flexisaf_internship.java_annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnhancementRequestTest {

    @Test
    void testAnnotationIsPresent() {
        Assertions.assertTrue(SampleFeature.class.isAnnotationPresent(EnhancementRequest.class));
    }

    @Test
    void testAnnotationValues() {
        EnhancementRequest er = SampleFeature.class.getAnnotation(EnhancementRequest.class);

        Assertions.assertNotNull(er, "Annotation should not be null");

        Assertions.assertEquals(101, er.id(), "ID should match");
        Assertions.assertEquals("Example feature implementation", er.synopsis(), "Synopsis should match");
    }

    @Test
    void testAnnotationUsesDefaultValues() {
        EnhancementRequest er = SampleFeature.class.getAnnotation(EnhancementRequest.class);

        Assertions.assertEquals("unassigned", er.engineer(), "Engineer should match");
        Assertions.assertEquals("unknown", er.date(), "Date values should match");
    }

    @Test
    void testAnnotationUsesValuesSuppliedForFieldWithDefaultValues() {
        EnhancementRequest er = SampleFeature2.class.getAnnotation(EnhancementRequest.class);

        Assertions.assertEquals("Bobby flare", er.engineer(), "Engineer names should match");
        Assertions.assertEquals("september 30", er.date(), "Date should match");
    }
}
