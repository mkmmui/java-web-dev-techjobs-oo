package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobOne;
    Job jobTwo;

    @Before
    public void createJobObjects() {
        jobOne = new Job();
        jobTwo = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertFalse(jobOne.getId() == jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobThree.getName(), "Product tester");
        assertEquals(jobThree.getEmployer(), "ACME");
        assertEquals(jobThree.getLocation(), "Desert");
        assertEquals(jobThree.getPositionType(), "Quality control");
        assertEquals(jobThree.getCoreCompetency(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(jobOne.equals(jobTwo));
    }

