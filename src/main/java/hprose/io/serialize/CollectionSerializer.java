/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * CollectionSerializer.java                              *
 *                                                        *
 * Collection serializer class for Java.                  *
 *                                                        *
 * LastModified: Sep 12, 2014                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.serialize;

import hprose.io.HproseWriter;
import java.io.IOException;
import java.util.Collection;

class CollectionSerializer implements HproseSerializer {

    public final static HproseSerializer instance = new CollectionSerializer();

    public void write(HproseWriter writer, Object obj) throws IOException {
        writer.writeCollectionWithRef((Collection) obj);
    }
}
