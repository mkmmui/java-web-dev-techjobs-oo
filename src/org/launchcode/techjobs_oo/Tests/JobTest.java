package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobOne;
    Job jobTwo;
    Job jobThree;
    Job jobFour;

    @Before
    public void createJobObjects() {
        jobOne = new Job();
        jobTwo = new Job();
        jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobFour = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

    }

    @Test
    public void testSettingJobId() {
        assertFalse(jobOne.getId() == jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(jobThree instanceof Job);
        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertTrue(jobThree.getLocation() instanceof Location);
        assertTrue(jobThree.getPositionType() instanceof PositionType);
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToStringWithBlankLines() {
        assertTrue(jobThree.toString().startsWith("\n"));
        assertTrue(jobThree.toString().endsWith("\n"));
    }

    @Test
    public void testToStringWithLabels() {
        assertTrue(jobThree.toString().contains("ID: "));
        assertTrue(jobThree.toString().contains("Name: "));
        assertTrue(jobThree.toString().contains("Employer: "));
        assertTrue(jobThree.toString().contains("Location: "));
        assertTrue(jobThree.toString().contains("Position Type: "));
        assertTrue(jobThree.toString().contains("Core Competency: "));
    }

    @Test
    public void testToStringWithNoData() {
//        assertTrue(jobFour.toString().contains("Name: Data not available"));
        assertTrue(jobFour.toString().contains("Employer: Data not available"));
        assertTrue(jobFour.toString().contains("Location: Data not available"));
        assertTrue(jobFour.toString().contains("Position Type: Data not available"));
        assertTrue(jobFour.toString().contains("Core Competency: Data not available"));
    }

}