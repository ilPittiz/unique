package unique

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes=['name', 'slug'])
@ToString(includes=['name', 'slug'], includeNames=true, includePackage=false)
class Cluster {

    private static final long serialVersionUID = 1

    String name
    String slug

    static constraints = {
        name	blank: false, unique: true
        slug	blank: false, unique: true
    }

}
