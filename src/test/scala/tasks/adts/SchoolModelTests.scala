package tasks.adts

import org.junit.*
import org.junit.Assert.*
import org.junit.jupiter.api.BeforeEach

class SchoolModelTests:

    import SchoolModel.* 
    val school:SchoolModule = SchoolImpl

    @BeforeEach def beforeEach():
        school = newSchool()

    //@Test def addTeacher():

