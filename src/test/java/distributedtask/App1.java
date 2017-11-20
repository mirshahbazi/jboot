/**
 * Copyright (c) 2015-2017, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package distributedtask;

import io.jboot.Jboot;


public class App1 {


    public static void main(String[] args) {

        //jboot端口号配置
        Jboot.setBootArg("jboot.server.port", "8080");

        //分布式任务，需要redis
        Jboot.setBootArg("jboot.redis.host", "127.0.0.1");

        Jboot.run(args);
    }


}
