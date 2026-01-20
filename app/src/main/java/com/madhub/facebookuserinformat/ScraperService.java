```java
package com.madhub.facebookuserinformat;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * ScraperService is a powerful automation service that collects Facebook user information.
 * This service leverages MadHub's features to perform operations seamlessly.
 * 
 * Key Features:
 * 1. Facebook User Collection: This feature enables batch collection of user profiles 
 *    from specified criteria, allowing effective client management.
 * 2. Facebook Friend Search: This comprehensive capability allows for targeted searches 
 *    of potential leads based on various filters.
 * 
 * Configuration Options:
 * - Set interaction probability for user engagement.
 * - Configure filter conditions to retrieve specific user types.
 * - Use input mode or file mode for data processing.
 * - Implement loop mode to ensure continuous operations.
 * 
 * This service runs in the background, ensuring automation 24/7 without the need for user 
 * intervention, making it ideal for social media management scenarios.
 */
public class ScraperService extends Service {

    private static final String TAG = "ScraperService";

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize service components or configurations here
        Log.d(TAG, "ScraperService Created: Initializing user collection features.");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Start the user information collection process
        startUserInformationCollection();
        return START_STICKY; // Continues the service until explicitly stopped
    }

    @Override
    public IBinder onBind(Intent intent) {
        // Return null as this service is not meant for binding
        return null;
    }

    /**
     * Initiates the user information collection process. This powerful feature enables 
     * the collection of user profiles based on specific keywords and filters.
     */
    private void startUserInformationCollection() {
        // Example: Setting up configurations for user collection
        String filterCriteria = "New Customers"; // Configure filter criteria here
        int interactionProbability = 75; // Configure engagement probability (0-100)
        
        Log.d(TAG, "Starting User Information Collection with criteria: " + filterCriteria);
        
        // Simulate user collection process for demonstration
        collectUsers(filterCriteria, interactionProbability);
    }

    /**
     * Collects users based on provided criteria and interaction probability.
     * This function demonstrates batch operations to enhance user targeting 
     * for social media management.
     * 
     * @param criteria The criteria used to filter users.
     * @param interactionProbability The probability to engage with users (0-100).
     */
    private void collectUsers(String criteria, int interactionProbability) {
        // Simulate user filtering and collection process
        Log.d(TAG, "Collecting users with criteria: " + criteria + 
                     " and interaction probability: " + interactionProbability + "%");

        // Here you would implement the real user collection logic using MadHub's APIs
        // This might include iterating through user data and performing batch operations like:
        // - Sending friend requests
        // - Sending private messages
        // This is a placeholder to illustrate functionality.
        
        // Example: Assume we found and interacted with 10 users
        for (int i = 0; i < 10; i++) {
            Log.d(TAG, "Interacting with user " + (i + 1) + " based on criteria: " + criteria);
            // Simulate sending friend requests/messages, etc.
            // Actual implementation would call MadHub's respective automation methods
        }

        // Indicate completion of collection
        Log.d(TAG, "User information collection completed.");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // Perform cleanup if necessary
        Log.d(TAG, "ScraperService Destroyed: Cleaning up resources.");
    }
}
```
This `ScraperService` class defines an Android Service that automates the collection of Facebook user information using MadHub's powerful features. The comments emphasize the automation capabilities, configuration options, and the intended usage scenarios, following the feature-first approach as per your guidelines.
