package grails.gorm.tests

import grails.persistence.Entity

/**
 * Test entity for testing AWS SimpleDB.
 *
 * @author Roman Stepanenko
 * @since 0.1
 */

@Entity
class OptLockNotVersioned implements Serializable {
    String id

    String name

    static mapping = {
        domain 'OptLockNotVersioned'
        version false
    }
}